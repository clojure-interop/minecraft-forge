(ns net.minecraftforge.items.wrapper.PlayerInvWrapper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.items.wrapper PlayerInvWrapper]))

(defn ->player-inv-wrapper
  "Constructor.

  inv - `net.minecraft.entity.player.InventoryPlayer`"
  (^PlayerInvWrapper [^net.minecraft.entity.player.InventoryPlayer inv]
    (new PlayerInvWrapper inv)))

