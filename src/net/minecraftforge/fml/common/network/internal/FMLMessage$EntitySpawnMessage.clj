(ns net.minecraftforge.fml.common.network.internal.FMLMessage$EntitySpawnMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.internal FMLMessage$EntitySpawnMessage]))

(defn ->entity-spawn-message
  "Constructor.

  er - `net.minecraftforge.fml.common.registry.EntityRegistry$EntityRegistration`
  entity - `net.minecraft.entity.Entity`
  mod-container - `net.minecraftforge.fml.common.ModContainer`"
  (^FMLMessage$EntitySpawnMessage [^net.minecraftforge.fml.common.registry.EntityRegistry$EntityRegistration er ^net.minecraft.entity.Entity entity ^net.minecraftforge.fml.common.ModContainer mod-container]
    (new FMLMessage$EntitySpawnMessage er entity mod-container))
  (^FMLMessage$EntitySpawnMessage []
    (new FMLMessage$EntitySpawnMessage )))

