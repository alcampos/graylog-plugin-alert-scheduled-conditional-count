# Message Scheduled Conditional Count Plugin for Graylog

[![Build Status](https://travis-ci.org/alcampos/graylog-plugin-alert-conditional-count.svg?branch=master)](https://travis-ci.org/alcampos/graylog-plugin-alert-conditional-count)

Graylog plugin that is triggered when there are more or less messages, in a specific date, (matching a defined query) than the threshold.

**Required Graylog version:** 2.3 and later

Installation
------------

[Download the plugin](https://github.com/alcampos/graylog-plugin-alert-scheduled-conditional-count/releases/latest)
and place the `.jar` file in your Graylog plugin directory. The plugin directory
is the `plugins/` folder relative from your `graylog-server` directory by default
and can be configured in your `graylog.conf` file.

Restart `graylog-server` and you are done.

Usage
-----

*Function Prototype:*

First we have to select the alert type **Message Scheduled Conditional Count Alert Condition**


![Alert Condition Selection](https://github.com/alcampos/graylog-plugin-alert-scheduled-conditional-count/blob/master/media/alert_condition.png)

And then we have to fill all the fields. We have two different fields:

The first one is the **query** field, that let you put a custom query. You have to put the same query that you look for in the search tab.

The second one is the **crontab** field, that let you put a custom crontab to schedule this call. You have to put a [Drools](http://javadox.com/org.drools/drools-core/6.2.0.Final/org/drools/core/time/impl/CronExpression.html) crontab for it to work.

![Alert Condition Fields](https://github.com/alcampos/graylog-plugin-alert-scheduled-conditional-count/blob/master/media/alert_condition_description.png)


Getting started
---------------

This project is using Maven 3 and requires Java 7 or higher.

* Clone this repository.
* Run `mvn package` to build a JAR file.
* Optional: Run `mvn jdeb:jdeb` and `mvn rpm:rpm` to create a DEB and RPM package respectively.
* Copy generated JAR file in target directory to your Graylog plugin directory.
* Restart the Graylog.

Plugin Release
--------------

We are using the maven release plugin:

```
$ mvn release:prepare
[...]
$ mvn release:perform
```

This sets the version numbers, creates a tag and pushes to GitHub. Travis CI will build the release artifacts and upload to GitHub automatically.
