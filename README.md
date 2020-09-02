# London API V2

A reimplementation of the [London API](https://github.com/ASweilam/londonapi).

## What is different?
This API uses a PostGreSQL database as a datasource rather than an external API. It is a proof-of-concept on utilising a different datasource. This is to avoid the situation where the external API may be down at some point. This API has only one endpoint, users who are within 50 Miles from London.


## Installation

- Clone the project.

```bash
$ git clone https://github.com/YOUR-USERNAME/YOUR-REPOSITORY
```

- The project uses PostGreSQL as a datasource. Download and install [PostGreSQL](https://www.postgresql.org/download/).

- Inside the resources folder in the project there is a DbScripts folder. This contains the SQL scripts to create the required table and insert the data into the table.

```bash
src/main/resources/DbScripts
```
- Go to application.properties file inside the project to change the database username and password to correspond to your setup of the database.

- Make sure to install the Maven dependencies before running the application
```bash
mvn clean install
```

## Contributing
Pull requests are welcome.


## License
[MIT](https://choosealicense.com/licenses/mit/)
