(ns net.minecraftforge.fml.common.event.FMLPostInitializationEvent
  "Called after FMLInitializationEvent has been dispatched on every mod. This is the third and last
  commonly called event during mod initialization.

  Recommended activities: interact with other mods to establish cross-mod behaviours."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLPostInitializationEvent]))

(defn ->fml-post-initialization-event
  "Constructor.

  data - `java.lang.Object`"
  (^FMLPostInitializationEvent [^java.lang.Object data]
    (new FMLPostInitializationEvent data)))

(defn get-mod-state
  "Description copied from class: FMLStateEvent

  returns: The current state of the mod - `net.minecraftforge.fml.common.LoaderState$ModState`"
  (^net.minecraftforge.fml.common.LoaderState$ModState [^FMLPostInitializationEvent this]
    (-> this (.getModState))))

(defn build-soft-depend-proxy
  "Build an object depending on if a specific target mod is loaded or not.

   Usually would be used to access an object from the other mod.

  mod-id - The modId I conditionally want to build an object for - `java.lang.String`
  class-name - The name of the class I wish to instantiate - `java.lang.String`
  arguments - `java.lang.Object`

  returns: An optional containing the object if possible, or null if not - `com.google.common.base.Optional<?>`"
  (^com.google.common.base.Optional [^FMLPostInitializationEvent this ^java.lang.String mod-id ^java.lang.String class-name ^java.lang.Object arguments]
    (-> this (.buildSoftDependProxy mod-id class-name arguments))))

