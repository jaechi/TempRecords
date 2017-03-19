package temprecords

class Temperature {

    String location
    Integer humidity
    Integer temperature
    Date dateCreated

    static constraints = {
        humidity(nullable: true)
    }
}
