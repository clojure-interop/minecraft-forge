(ns net.minecraftforge.server.permission.context.TargetContext
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.permission.context TargetContext]))

(defn ->target-context
  "Constructor.

  ep - `net.minecraft.entity.player.EntityPlayer`
  entity - `net.minecraft.entity.Entity`"
  (^TargetContext [^net.minecraft.entity.player.EntityPlayer ep ^net.minecraft.entity.Entity entity]
    (new TargetContext ep entity)))

(defn get
  "key - Context key - `net.minecraftforge.server.permission.context.ContextKey`

  returns: Context object - `<T> T`"
  ([^TargetContext this ^net.minecraftforge.server.permission.context.ContextKey key]
    (-> this (.get key))))

