#!/bin/bash

echo "start the docker compose"
docker-compose -p zipkin-monitoring -f zipkin-compose.yml up -d --remove-orphans