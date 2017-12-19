package com.alexjck.plugins.scheduled.conditional;

import org.graylog2.plugin.Plugin;
import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.PluginModule;

import java.util.Collection;
import java.util.Collections;

public class ScheduledConditionalCountAlertConditionPlugin implements Plugin {
    @Override
    public PluginMetaData metadata() {
        return new ScheduledConditionalCountAlertConditionMetaData();
    }

    @Override
    public Collection<PluginModule> modules () {
        return Collections.<PluginModule>singletonList(new ScheduledConditionalCountAlertConditionModule());
    }
}
