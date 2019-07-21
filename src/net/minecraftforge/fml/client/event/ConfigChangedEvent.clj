(ns net.minecraftforge.fml.client.event.ConfigChangedEvent
  "These events are posted from the GuiConfig screen when the done button is pressed. The events are only posted
  if the parent screen is not an instance of GuiConfig or if the configID field has been set for
  the GuiConfig screen.

  Listeners for this event should use OnConfigChanged or PostConfigChanged and check for a specific mod ID.
  For best results the listener should refresh any objects/fields that are set based on the mod's config
  and should serialize the modified config."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.event ConfigChangedEvent]))

(defn ->config-changed-event
  "Constructor.

  mod-id - `java.lang.String`
  config-id - `java.lang.String`
  is-world-running - `boolean`
  requires-mc-restart - `boolean`"
  (^ConfigChangedEvent [^java.lang.String mod-id ^java.lang.String config-id ^Boolean is-world-running ^Boolean requires-mc-restart]
    (new ConfigChangedEvent mod-id config-id is-world-running requires-mc-restart)))

(defn get-mod-id
  "The Mod ID of the mod whose configuration just changed.

  returns: `java.lang.String`"
  (^java.lang.String [^ConfigChangedEvent this]
    (-> this (.getModID))))

(defn world-running?
  "Whether or not a world is currently running.

  returns: `boolean`"
  (^Boolean [^ConfigChangedEvent this]
    (-> this (.isWorldRunning))))

(defn requires-mc-restart?
  "Will be set to true if any elements were changed that require a restart of Minecraft.

  returns: `boolean`"
  (^Boolean [^ConfigChangedEvent this]
    (-> this (.isRequiresMcRestart))))

(defn get-config-id
  "A String identifier for this ConfigChangedEvent.

  returns: `java.lang.String`"
  (^java.lang.String [^ConfigChangedEvent this]
    (-> this (.getConfigID))))

