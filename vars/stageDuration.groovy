import groovy.time.TimeCategory 
import groovy.time.TimeDuration


def call(java.util.Date start, java.util.Date stop) {
    TimeDuration td = TimeCategory.minus( stop, start )
    return td
}
