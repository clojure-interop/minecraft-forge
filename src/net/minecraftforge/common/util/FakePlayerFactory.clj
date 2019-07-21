(ns net.minecraftforge.common.util.FakePlayerFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.util FakePlayerFactory]))

(defn ->fake-player-factory
  "Constructor."
  (^FakePlayerFactory []
    (new FakePlayerFactory )))

(defn *get-minecraft
  "world - `net.minecraft.world.WorldServer`

  returns: `net.minecraftforge.common.util.FakePlayer`"
  (^net.minecraftforge.common.util.FakePlayer [^net.minecraft.world.WorldServer world]
    (FakePlayerFactory/getMinecraft world)))

(defn *get
  "Get a fake player with a given username,
   Mods should either hold weak references to the return value, or listen for a
   WorldEvent.Unload and kill all references to prevent worlds staying in memory.

  world - `net.minecraft.world.WorldServer`
  username - `com.mojang.authlib.GameProfile`

  returns: `net.minecraftforge.common.util.FakePlayer`"
  (^net.minecraftforge.common.util.FakePlayer [^net.minecraft.world.WorldServer world ^com.mojang.authlib.GameProfile username]
    (FakePlayerFactory/get world username)))

(defn *unload-world
  "world - `net.minecraft.world.WorldServer`"
  ([^net.minecraft.world.WorldServer world]
    (FakePlayerFactory/unloadWorld world)))

