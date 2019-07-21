(ns net.minecraftforge.fml.client.event.ConfigChangedEvent$PostConfigChangedEvent
  "This event is provided for mods to consume if they want to be able to check if other mods' configs have been changed.
  This event only fires if the OnConfigChangedEvent result is not DENY."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.event ConfigChangedEvent$PostConfigChangedEvent]))

(defn ->post-config-changed-event
  "Constructor.

  mod-id - `java.lang.String`
  config-id - `java.lang.String`
  is-world-running - `boolean`
  requires-mc-restart - `boolean`"
  (^ConfigChangedEvent$PostConfigChangedEvent [^java.lang.String mod-id ^java.lang.String config-id ^Boolean is-world-running ^Boolean requires-mc-restart]
    (new ConfigChangedEvent$PostConfigChangedEvent mod-id config-id is-world-running requires-mc-restart)))

