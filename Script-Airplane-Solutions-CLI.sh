#!/bin/bash

VERSAO=0

echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Olá, serei seu assistente de instalação da Airplane Solutions"
echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Primeiro vamos atualizar os pacotes do seu Sistema Operacional"

sleep 3

sudo apt update -y && sudo apt upgrade -y # Atualizações para o usuário

echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Clonando repositório do projeto!"

sleep 3

git clone https://github.com/Sprint-23-1-Grupo-8-2ADS-C/jswing-sprint2.git # Clone repositório

echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Entrando na pasta!"

sleep 3

cd jswing-sprint2 # Entrando na pasta para usar CLI

echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Instalando Docker e Docker Compose!"

sleep 3

sudo apt install docker.io docker-compose -y # Instalação Docker e Docker Compose

echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Inicializando o Docker!"

sleep 3

sudo systemctl start docker # Inicializando Docker

echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Habilitando o Docker para iniciar automaticamente na inicialização do sistema!"

sleep 3

sudo systemctl enable docker # Habilitando Docker

if [ $VERSAO -eq 17 ]; then
    echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Baixando Projeto"
    sleep 3
    wget https://github.com/Sprint-23-1-Grupo-8-2ADS-C/jswing-sprint2/raw/main/jswing-sprint2-v1.1.jar

    echo "$(tput setaf 4)[Bot Airplaner]:$(tput setaf 7) Executando API"
    sleep 3
    java -jar jswing-sprint2-v1.1.jar
fi
