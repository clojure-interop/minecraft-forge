(ns net.minecraft.world.demo.DemoWorldServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.demo DemoWorldServer]))

(defn ->demo-world-server
  "Constructor.

  server - `net.minecraft.server.MinecraftServer`
  save-handler-in - `net.minecraft.world.storage.ISaveHandler`
  world-info-in - `net.minecraft.world.storage.WorldInfo`
  dimension-id - `int`
  profiler-in - `net.minecraft.profiler.Profiler`"
  (^DemoWorldServer [^net.minecraft.server.MinecraftServer server ^net.minecraft.world.storage.ISaveHandler save-handler-in ^net.minecraft.world.storage.WorldInfo world-info-in ^Integer dimension-id ^net.minecraft.profiler.Profiler profiler-in]
    (new DemoWorldServer server save-handler-in world-info-in dimension-id profiler-in)))

(def *-demo-world-settings
  "Static Constant.

  type: net.minecraft.world.WorldSettings"
  DemoWorldServer/DEMO_WORLD_SETTINGS)

