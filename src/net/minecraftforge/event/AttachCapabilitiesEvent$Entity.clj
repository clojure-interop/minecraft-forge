(ns net.minecraftforge.event.AttachCapabilitiesEvent$Entity
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event AttachCapabilitiesEvent$Entity]))

(defn ->entity
  "Constructor.

  Deprecated.

  entity - `net.minecraft.entity.Entity`"
  (^AttachCapabilitiesEvent$Entity [^net.minecraft.entity.Entity entity]
    (new AttachCapabilitiesEvent$Entity entity)))

(defn get-entity
  "Deprecated.

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^AttachCapabilitiesEvent$Entity this]
    (-> this (.getEntity))))

