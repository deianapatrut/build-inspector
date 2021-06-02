import org.dxworks.buildinspector.Main
import org.dxworks.buildinspector.statistics.BuildsPassedStatistic
import org.junit.Test

internal class  StatisticServiceIT {
    @Test
    fun write() {
        val main = Main()
        main.analyze()

    }

}