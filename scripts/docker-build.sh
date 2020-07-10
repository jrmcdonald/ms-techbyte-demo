#!/usr/bin/env bash
set -e

./gradlew bootBuildImage --imageName $IMAGE

should_push=${PUSH_IMAGE:-false}

if $should_push; then
    docker push $IMAGE
fi
