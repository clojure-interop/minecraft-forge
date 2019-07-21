(ns net.minecraftforge.fml.common.event.FMLInterModComms$IMCEvent
  "Subscribe to this event to receive your messages (they are sent between
  FMLInitializationEvent and FMLPostInitializationEvent)"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLInterModComms$IMCEvent]))

(defn ->imc-event
  "Constructor."
  (^FMLInterModComms$IMCEvent []
    (new FMLInterModComms$IMCEvent )))

(defn apply-mod-container
  "active-container - `net.minecraftforge.fml.common.ModContainer`"
  ([^FMLInterModComms$IMCEvent this ^net.minecraftforge.fml.common.ModContainer active-container]
    (-> this (.applyModContainer active-container))))

(defn get-messages
  "returns: `com.google.common.collect.ImmutableList<net.minecraftforge.fml.common.event.FMLInterModComms$IMCMessage>`"
  (^com.google.common.collect.ImmutableList [^FMLInterModComms$IMCEvent this]
    (-> this (.getMessages))))

