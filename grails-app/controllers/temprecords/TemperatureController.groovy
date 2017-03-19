package temprecords

import grails.converters.JSON


class TemperatureController {

    def persistenceService


    /**
     * http://localhost:8080/TempRecords/Temperature/
     */
    def index() {

        //def jsonObj = JSON.parse(request)
        def jsonObj = request.JSON
        //print "request JSON"
        print jsonObj
        switch (request.method) {
            case "POST":
                //print "POST"
                String location = jsonObj.location
                Integer temp = jsonObj.temperature
                Integer humidity = jsonObj.humidity
                persistenceService.save(location, temp, humidity)
                break
            case "GET":
                print "GET"
                break
            case "PUT":
                print "PUT"
                break
            case "DELETE":
                print "DELETE"
                break
            default:
                print "default"
                break
        }

        render persistenceService.listAll() as JSON
    }

    def add() {
        //temps[location] = number
        render "found it"
    }

}
