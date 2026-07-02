## Panel 1: API Request Rate (Requests per Second)
Purpose: Shows how many API requests (all endpoints) are hitting the server every second.
Query: sum(rate(http_server_requests_seconds_count[1m]))

## Panel 2: API Request Rate per Endpoint
Purpose: Identifies which API endpoint (e.g., /api/mood, /api/checkin) is receiving the most traffic.
Query: sum(rate(http_server_requests_seconds_count[1m])) by (uri)

## Panel 3: CPU Usage (Bar Chart, via Collectd + InfluxDB)
Data Source: InfluxDB · Measurement: cpu_value · Field: usage_idle
Query (InfluxQL): SELECT mean("usage_idle") FROM "cpu_value" WHERE $timeFilter GROUP BY time($__interval) fill(null)

## Panel 4: Memory Usage (Gauge/Time Series, via Collectd + InfluxDB)
Data Source: InfluxDB · Measurement: memory_value · Field: used_percent
Query (InfluxQL): SELECT mean("used_percent") FROM "memory_value" WHERE $timeFilter GROUP BY time($__interval) fill(null)
