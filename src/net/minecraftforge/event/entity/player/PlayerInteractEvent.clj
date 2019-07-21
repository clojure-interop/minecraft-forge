(ns net.minecraftforge.event.entity.player.PlayerInteractEvent
  "PlayerInteractEvent is fired when a player interacts in some way.
  All subclasses are fired on MinecraftForge.EVENT_BUS.
  See the individual documentation on each subevent for more details."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerInteractEvent]))

(defn get-hand
  "returns: The hand involved in this interaction. Will never be null. - `net.minecraft.util.EnumHand`"
  (^net.minecraft.util.EnumHand [^PlayerInteractEvent this]
    (-> this (.getHand))))

(defn get-item-stack
  "returns: The itemstack involved in this interaction, ItemStack.EMPTY if the hand was empty. - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^PlayerInteractEvent this]
    (-> this (.getItemStack))))

(defn get-pos
  "If the interaction was on an entity, will be a BlockPos centered on the entity.
   If the interaction was on a block, will be the position of that block.
   Otherwise, will be a BlockPos centered on the player.
   Will never be null.

  returns: The position involved in this interaction. - `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^PlayerInteractEvent this]
    (-> this (.getPos))))

(defn get-face
  "returns: The face involved in this interaction. For all non-block interactions, this will return null. - `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^PlayerInteractEvent this]
    (-> this (.getFace))))

(defn get-world
  "returns: Convenience method to get the world of this interaction. - `net.minecraft.world.World`"
  (^net.minecraft.world.World [^PlayerInteractEvent this]
    (-> this (.getWorld))))

(defn get-side
  "returns: The effective, i.e. logical, side of this interaction. This will be Side.CLIENT on the client thread, and Side.SERVER on the server thread. - `net.minecraftforge.fml.relauncher.Side`"
  (^net.minecraftforge.fml.relauncher.Side [^PlayerInteractEvent this]
    (-> this (.getSide))))

