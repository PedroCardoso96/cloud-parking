# cloud-parking
Cloud Parking Java

## Run Database
docker run --name parking-db -p 5432:5432 -e POSTGRES_DB=parking -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=123 -d postgres:10-alpine

## Stop Database
docker stop parking-db

## Start Database
docker start parking-db