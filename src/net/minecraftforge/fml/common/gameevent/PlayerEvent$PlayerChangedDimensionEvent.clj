(ns net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerChangedDimensionEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.gameevent PlayerEvent$PlayerChangedDimensionEvent]))

(defn ->player-changed-dimension-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  from-dim - `int`
  to-dim - `int`"
  (^PlayerEvent$PlayerChangedDimensionEvent [^net.minecraft.entity.player.EntityPlayer player ^Integer from-dim ^Integer to-dim]
    (new PlayerEvent$PlayerChangedDimensionEvent player from-dim to-dim)))

(defn from-dim
  "Instance Constant.

  type: int"
  (^Integer [^PlayerEvent$PlayerChangedDimensionEvent this]
    (-> this .-fromDim)))

(defn to-dim
  "Instance Constant.

  type: int"
  (^Integer [^PlayerEvent$PlayerChangedDimensionEvent this]
    (-> this .-toDim)))

