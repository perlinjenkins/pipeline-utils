import groovy.time.TimeCategory 
import groovy.time.TimeDuration

def stDuration (Date start, Date stop){
    TimeDuration td = TimeCategory.minus( stop, start )
     return td
}

def call(Date start, Date stop) {
    return stDuration (start, stop)
}
