(ns net.minecraftforge.fml.client.event.ConfigChangedEvent$OnConfigChangedEvent
  "This event is intended to be consumed by the mod whose config has been changed. It fires when the Done button
  has been clicked on a GuiConfig screen and the following conditions are met:
  - at least one config element has been changed
  - one of these 2 conditions are met:
       1) the parent screen is null or is not an instance of GuiConfig
       2) the configID field has been set to a non-null value for the GuiConfig screen
  Modders should check the modID field of the event to ensure they are only acting on their own config screen's event!"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.event ConfigChangedEvent$OnConfigChangedEvent]))

(defn ->on-config-changed-event
  "Constructor.

  mod-id - `java.lang.String`
  config-id - `java.lang.String`
  is-world-running - `boolean`
  requires-mc-restart - `boolean`"
  (^ConfigChangedEvent$OnConfigChangedEvent [^java.lang.String mod-id ^java.lang.String config-id ^Boolean is-world-running ^Boolean requires-mc-restart]
    (new ConfigChangedEvent$OnConfigChangedEvent mod-id config-id is-world-running requires-mc-restart)))

