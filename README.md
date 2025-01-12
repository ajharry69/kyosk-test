# kyosk-test

A simple spring boot application that provides an API endpoint for listing books.

## Building and Running

### Using (Plain) Docker

#### What you will need

1. [Install docker][docker-installation-url].

#### Build the docker image

```bash
docker build --tag ghcr.io/ajharry69/kyosk-test .
```

#### Start the container

```bash
docker run --rm --publish 8080:8080 ghcr.io/ajharry69/kyosk-test
```

### Using Kubernetes (k8s)

#### What you will need

1. [Install docker][docker-installation-url].
2. [Install kubectl](https://kubernetes.io/docs/reference/kubectl/).
   1. [Install for linux](https://kubernetes.io/docs/tasks/tools/install-kubectl-linux/).
   2. [Install for macOS](https://kubernetes.io/docs/tasks/tools/install-kubectl-macos/).
   3. [Install for Windows](https://kubernetes.io/docs/tasks/tools/install-kubectl-windows/).
3. [Install minikube](https://minikube.sigs.k8s.io/docs/start/).

#### Start minikube

```bash
minikube start
```

#### Apply k8s manifests

The following command assumes that [Start minikube](#start-minikube) phase is done successfully.

```bash
kubectl apply --filename k8s/
```

## Accessing the API

The following commands assume that [Building & Running](#building-and-running) phase is done successfully.

### Using browser

1. Open your favorite web browser.
2. Visit http://localhost:8080/books in a new browser tab.

### Using curl

#### What you will need

1. [Install curl](https://curl.se/download.html).

#### Access the application

```bash
curl --request "GET" \
      --header "Accept: application/json" \
      --url 'http://localhost:8080/books'
```

[docker-installation-url]: https://docs.docker.com/engine/install/
