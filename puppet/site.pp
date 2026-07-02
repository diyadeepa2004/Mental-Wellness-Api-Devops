node 'wellness-agent' {

  package { 'openjdk-17-jdk':
    ensure => installed,
  }

  file { '/opt/wellness-api/wellness-api.jar':
    ensure  => file,
    source  => 'puppet:///modules/wellness/wellness-api.jar',
    require => Package['openjdk-17-jdk'],
  }

  service { 'wellness-api':
    ensure  => running,
    enable  => true,
    require => File['/opt/wellness-api/wellness-api.jar'],
  }
}
