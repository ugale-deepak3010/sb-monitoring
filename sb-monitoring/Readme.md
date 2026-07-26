# Welcome
  
  Prometheus & 
  Actuator is needed.  
  
  
 __________________________________________
 
 I manually installed Promethus using dnf command.
 
 >sudo dnf install prometheus
 
once install it have one default file here

sudo nano /etc/prometheus/prometheus.yml
  
  Need to update
  
  scrape_configs
  
  metrics_path defaults to '/metrics'
  to
  metrics_path defaults to '/actuator/prometheus'  
  
  job_name: 'prometheus'
  to
  job_name: 'prometheus'
  
  
  
____________________________________

Gemini Using same 9090 port so using 9099
  
/etc/default/prometheus

`ARGS=''`
to
`ARGS='--web.listen-address="0.0.0.0:9099"'`

___________________________________________
  
  sudo systemctl start prometheus  
  sudo systemctl enable prometheus  
  
  sudo systemctl status prometheus
  
  sudo systemctl restart prometheus
  

______________________________________  

  
  /etc/prometheus/prometheus.yml
  
  Above file is attached in project just for reference! 
  
_________________________________________



visit

http://localhost:9099/
  
  in query search (UI Explorer also provide but mine is broken so can copy from http://localhost:8080/actuator/prometheus)
  
 	`system_cpu_usage`
  
  above query will return like this. 0.23% CPU is utilizing.
  
  `system_cpu_usage{instance="localhost:8080", job="sb-monitor"}	0.23532414497192444`
  
  
_________________________________ 

  query can be use like this by providing parameters.
	
	http_server_requests_seconds_count{status="404"}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  