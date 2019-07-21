(ns net.minecraftforge.server.permission.context.Context
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.permission.context Context]))

(defn ->context
  "Constructor."
  (^Context []
    (new Context )))

(defn get-world
  "Description copied from interface: IContext

  returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^Context this]
    (-> this (.getWorld))))

(defn get-player
  "returns: Player requesting permission. Can be null - `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^Context this]
    (-> this (.getPlayer))))

(defn get
  "key - Context key - `net.minecraftforge.server.permission.context.ContextKey`

  returns: Context object - `<T> T`"
  ([^Context this ^net.minecraftforge.server.permission.context.ContextKey key]
    (-> this (.get key))))

(defn has
  "key - Context key - `net.minecraftforge.server.permission.context.ContextKey`

  returns: true if context contains this key - `boolean`"
  (^Boolean [^Context this ^net.minecraftforge.server.permission.context.ContextKey key]
    (-> this (.has key))))

(defn set
  "Sets Context object

  key - Context key - `net.minecraftforge.server.permission.context.ContextKey`
  obj - Context object. Can be null - `T`

  returns: itself, for easy context chaining - `<T> net.minecraftforge.server.permission.context.Context`"
  ([^Context this ^net.minecraftforge.server.permission.context.ContextKey key obj]
    (-> this (.set key obj))))

