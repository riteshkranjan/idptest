node 'puppetagent1.fd3lxcr0ohmupihn355hl54zvc.rx.internal.cloudapp.net' {
  package { 'apache2':
    ensure => installed,
  }

  service { 'apache2':
    ensure  => true,
    enable  => true,
    require => Package['apache2'],
  }
}

