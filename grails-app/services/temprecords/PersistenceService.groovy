package temprecords

import grails.transaction.Transactional

import javax.annotation.PostConstruct

@Transactional
class PersistenceService {

    def temps

    @PostConstruct
    init() {
        temps = [:]
    }

    def save(String location, Integer temp, Integer humidity) {
        def domain = new Temperature()
        domain.location = location
        domain.temperature = temp
        domain.humidity = humidity
        domain.save()
    }

    def listAll() {
        Temperature.findAll()
    }
    /*
    def list() {
        def value = ''
        temps.each{ k, v ->
            println "${k}:${v}"
            value = value + "${k}: ${v}"
        }
        return value
    }
    */

}
