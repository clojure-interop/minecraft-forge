(ns net.minecraft.world.WorldServerMulti
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world WorldServerMulti]))

(defn ->world-server-multi
  "Constructor.

  server - `net.minecraft.server.MinecraftServer`
  save-handler-in - `net.minecraft.world.storage.ISaveHandler`
  dimension-id - `int`
  delegate - `net.minecraft.world.WorldServer`
  profiler-in - `net.minecraft.profiler.Profiler`"
  (^WorldServerMulti [^net.minecraft.server.MinecraftServer server ^net.minecraft.world.storage.ISaveHandler save-handler-in ^Integer dimension-id ^net.minecraft.world.WorldServer delegate ^net.minecraft.profiler.Profiler profiler-in]
    (new WorldServerMulti server save-handler-in dimension-id delegate profiler-in)))

(defn init
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^WorldServerMulti this]
    (-> this (.init))))

(defn flush
  ""
  ([^WorldServerMulti this]
    (-> this (.flush))))

(defn save-additional-data
  ""
  ([^WorldServerMulti this]
    (-> this (.saveAdditionalData))))

