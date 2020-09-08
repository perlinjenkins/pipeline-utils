import groovy.time.TimeCategory 
import groovy.time.TimeDuration


def call(Date start, Date stop) {
    TimeDuration td = TimeCategory.minus( stop, start )
    return td
}
