(ns net.minecraftforge.event.AttachCapabilitiesEvent$World
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event AttachCapabilitiesEvent$World]))

(defn ->world
  "Constructor.

  Deprecated.

  world - `net.minecraft.world.World`"
  (^AttachCapabilitiesEvent$World [^net.minecraft.world.World world]
    (new AttachCapabilitiesEvent$World world)))

(defn get-world
  "Deprecated.

  returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^AttachCapabilitiesEvent$World this]
    (-> this (.getWorld))))

