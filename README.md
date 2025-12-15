<div align="center">

# 🔲 QR Code Generator

### Gerador de QR Codes com Spring Boot, AWS S3 e Docker

[![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.8-brightgreen?style=for-the-badge&logo=spring)](https://spring.io/projects/spring-boot)
[![AWS S3](https://img.shields.io/badge/AWS-S3-orange?style=for-the-badge&logo=amazon-aws)](https://aws.amazon.com/s3/)
[![Docker](https://img.shields.io/badge/Docker-Ready-blue?style=for-the-badge&logo=docker)](https://www.docker.com/)
[![Maven](https://img.shields.io/badge/Maven-3.9.6-red?style=for-the-badge&logo=apache-maven)](https://maven.apache.org/)

</div>

---

## 📋 Sobre o Projeto

API REST desenvolvida em Spring Boot para geração de QR Codes com armazenamento automático na AWS S3. Solução containerizada com Docker, ideal para integração em sistemas que necessitam de geração dinâmica de QR Codes.

### ✨ Funcionalidades

- 🎯 Geração de QR Codes personalizados
- ☁️ Upload automático para AWS S3
- 🐳 Containerização com Docker
- 🚀 API REST simples e eficiente
- 📦 Build otimizado com Maven

---

## 🛠️ Tecnologias

| Tecnologia | Versão | Descrição |
|------------|--------|-----------|
| **Java** | 17 | Linguagem de programação |
| **Spring Boot** | 3.5.8 | Framework web |
| **ZXing** | 3.5.0 | Biblioteca para geração de QR Codes |
| **AWS SDK** | 2.25.61 | Integração com AWS S3 |
| **Maven** | 3.9.6 | Gerenciador de dependências |
| **Docker** | - | Containerização |

---

## 🚀 Como Executar

### Pré-requisitos

- Java 17+
- Maven 3.9+
- Docker (opcional)
- Conta AWS com acesso ao S3

### Configuração

1. **Clone o repositório**
```bash
git clone <seu-repositorio>
cd qrcodegenerator
```

2. **Configure as variáveis de ambiente**

Crie um arquivo `.env` na raiz do projeto:
```env
AWS_ACCESS_KEY_ID=<sua-access-key>
AWS_SECRET_ACCESS_KEY=<sua-secret-key>
AWS_REGION=us-east-2
AWS_BUCKET_NAME=qrcodestoragesatushi
```

### Executar Localmente

```bash
# Compilar o projeto
mvn clean package

# Executar a aplicação
java -jar target/qrcode-0.0.1-SNAPSHOT.jar
```

### Executar com Docker

```bash
# Build da imagem
docker build -t qrcode-generator \
  --build-arg AWS_ACCESS_KEY_ID=<sua-access-key> \
  --build-arg AWS_SECRET_ACCESS_KEY=<sua-secret-key> \
  .

# Executar o container
docker run -p 8080:8080 qrcode-generator
```

---

## 📡 Endpoints da API

### Gerar QR Code

```http
POST /api/qrcode/generate
Content-Type: application/json

{
  "data": "https://exemplo.com",
  "size": 300
}
```

**Resposta:**
```json
{
  "qrcodeUrl": "https://s3.us-east-2.amazonaws.com/qrcodestoragesatushi/qrcode-123456.png",
  "status": "success"
}
```

---

## 📁 Estrutura do Projeto

```
qrcodegenerator/
├── src/
│   ├── main/
│   │   ├── java/com/dev/qrcode/
│   │   │   ├── controller/      # Controllers REST
│   │   │   ├── service/         # Lógica de negócio
│   │   │   ├── config/          # Configurações AWS
│   │   │   └── QrcodeApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── Dockerfile
├── pom.xml
└── README.md
```

---

## 🔒 Segurança

- ⚠️ Nunca commite credenciais AWS no repositório
- 🔐 Use variáveis de ambiente para informações sensíveis
- 🛡️ Configure políticas IAM adequadas no AWS S3
- 🔑 Utilize AWS Secrets Manager em produção

---

## 🤝 Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

1. Fork o projeto
2. Crie uma branch para sua feature (`git checkout -b feature/NovaFuncionalidade`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova funcionalidade'`)
4. Push para a branch (`git push origin feature/NovaFuncionalidade`)
5. Abra um Pull Request

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

<div align="center">

**Desenvolvido com ☕ e Java**

</div>
