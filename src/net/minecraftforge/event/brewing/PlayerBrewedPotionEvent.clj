(ns net.minecraftforge.event.brewing.PlayerBrewedPotionEvent
  "This event is called when a player picks up a potion from a brewing stand."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.brewing PlayerBrewedPotionEvent]))

(defn ->player-brewed-potion-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  stack - `net.minecraft.item.ItemStack`"
  (^PlayerBrewedPotionEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack stack]
    (new PlayerBrewedPotionEvent player stack)))

(defn get-stack
  "The ItemStack of the potion.

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^PlayerBrewedPotionEvent this]
    (-> this (.getStack))))

