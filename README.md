# LRUCache Implementation in Java

This project implements a Least Recently Used (LRU) Cache in Java using a combination of a HashMap and a doubly linked list. The cache supports basic operations like `get` and `put`.

## Features

- **LRU Cache**: Efficiently manages cache items, ensuring the least recently used items are removed when the cache reaches its capacity.
- **Generics Support**: The `CustomHashMap` class is implemented using generics for flexibility in key and value types.
- **Collision Handling**: The `CustomHashMap` uses linked lists to handle hash collisions.

## Table of Contents

- [Architecture](#architecture)
- [Prerequisites](#prerequisites)
- [Installation](#installation)


## Architecture

The project consists of the following main components:

- **LRUCache**: Manages the LRU cache operations.
- **Node**: Represents each entry in the LRU cache.
- **Client**: Provides a main method to demonstrate the usage of the LRU cache.

## Prerequisites

- **Java Development Kit (JDK)**: Ensure that JDK is installed on your system. You can download it from [Oracle's JDK page](https://www.oracle.com/java/technologies/javase-downloads.html) or use OpenJDK.

## Installation

1. Clone the repository or download the source code.
2. Navigate to the project directory.



