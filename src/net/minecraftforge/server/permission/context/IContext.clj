(ns net.minecraftforge.server.permission.context.IContext
  "Use BlockPosContext or PlayerContext when possible"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.permission.context IContext]))

(defn get-world
  "World from where permission is requested. Can be null

  returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^IContext this]
    (-> this (.getWorld))))

(defn get-player
  "returns: Player requesting permission. Can be null - `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^IContext this]
    (-> this (.getPlayer))))

(defn get
  "key - Context key - `net.minecraftforge.server.permission.context.ContextKey`

  returns: Context object - `<T> T`"
  ([^IContext this ^net.minecraftforge.server.permission.context.ContextKey key]
    (-> this (.get key))))

(defn has
  "key - Context key - `net.minecraftforge.server.permission.context.ContextKey`

  returns: true if context contains this key - `boolean`"
  (^Boolean [^IContext this ^net.minecraftforge.server.permission.context.ContextKey key]
    (-> this (.has key))))

