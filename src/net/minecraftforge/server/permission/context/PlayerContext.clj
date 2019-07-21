(ns net.minecraftforge.server.permission.context.PlayerContext
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.permission.context PlayerContext]))

(defn ->player-context
  "Constructor.

  ep - `net.minecraft.entity.player.EntityPlayer`"
  (^PlayerContext [^net.minecraft.entity.player.EntityPlayer ep]
    (new PlayerContext ep)))

(defn get-world
  "Description copied from interface: IContext

  returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^PlayerContext this]
    (-> this (.getWorld))))

(defn get-player
  "returns: Player requesting permission. Can be null - `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^PlayerContext this]
    (-> this (.getPlayer))))

