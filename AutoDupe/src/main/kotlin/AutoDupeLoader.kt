import com.lambda.client.plugin.api.Plugin

internal object AutoDupeLoader: Plugin() {

    override fun onLoad() {
        modules.add(AutoDupe)
    }

    override fun onUnload() {}
}