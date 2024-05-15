
chmod -R 777 etcd/data

chmod -R 777 prometheus/data

chmod -R 777 grafana/data

docker compose up -d
