(ns net.minecraftforge.fml.common.event.FMLModIdMappingEvent
  "Called whenever the ID mapping might have changed. If you register for this event, you
  will be called back whenever the client or server loads an ID set. This includes both
  when the ID maps are loaded from disk, as well as when the ID maps revert to the initial
  state.

  Note: you cannot change the IDs that have been allocated, but you might want to use
  this event to update caches or other in-mod artifacts that might be impacted by an ID
  change."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLModIdMappingEvent]))

(defn ->fml-mod-id-mapping-event
  "Constructor.

  blocks - `java.util.Map`
  items - `java.util.Map`
  is-frozen - `boolean`"
  (^FMLModIdMappingEvent [^java.util.Map blocks ^java.util.Map items ^Boolean is-frozen]
    (new FMLModIdMappingEvent blocks items is-frozen)))

(defn remapped-ids
  "Instance Constant.

  type: com.google.common.collect.ImmutableList<net.minecraftforge.fml.common.event.FMLModIdMappingEvent$ModRemapping>"
  (^com.google.common.collect.ImmutableList [^FMLModIdMappingEvent this]
    (-> this .-remappedIds)))

(defn is-frozen
  "Instance Constant.

  type: boolean"
  (^Boolean [^FMLModIdMappingEvent this]
    (-> this .-isFrozen)))

