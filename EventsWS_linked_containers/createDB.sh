#!/bin/bash

service mysql start &
mysql_pid=$!

until mysqladmin ping &>/dev/null; do
  echo -n "."; sleep 0.2
done

mysql -u root <<< 'create database events'
mysql -u root events < events.sql
