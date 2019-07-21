(ns net.minecraft.tileentity.CommandBlockBaseLogic
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity CommandBlockBaseLogic]))

(defn ->command-block-base-logic
  "Constructor."
  (^CommandBlockBaseLogic []
    (new CommandBlockBaseLogic )))

(defn get-success-count
  "returns: `int`"
  (^Integer [^CommandBlockBaseLogic this]
    (-> this (.getSuccessCount))))

(defn write-to-nbt
  "p-189510-1 - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^CommandBlockBaseLogic this ^net.minecraft.nbt.NBTTagCompound p-189510-1]
    (-> this (.writeToNBT p-189510-1))))

(defn get-command-result-stats
  "returns: `net.minecraft.command.CommandResultStats`"
  (^net.minecraft.command.CommandResultStats [^CommandBlockBaseLogic this]
    (-> this (.getCommandResultStats))))

(defn update-command
  ""
  ([^CommandBlockBaseLogic this]
    (-> this (.updateCommand))))

(defn read-data-from-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^CommandBlockBaseLogic this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.readDataFromNBT nbt))))

(defn set-command
  "command - `java.lang.String`"
  ([^CommandBlockBaseLogic this ^java.lang.String command]
    (-> this (.setCommand command))))

(defn try-open-edit-command-block
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^CommandBlockBaseLogic this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.tryOpenEditCommandBlock player-in))))

(defn get-command
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandBlockBaseLogic this]
    (-> this (.getCommand))))

(defn set-command-stat
  "type - `net.minecraft.command.CommandResultStats$Type`
  amount - `int`"
  ([^CommandBlockBaseLogic this ^net.minecraft.command.CommandResultStats$Type type ^Integer amount]
    (-> this (.setCommandStat type amount))))

(defn set-name
  "name - `java.lang.String`"
  ([^CommandBlockBaseLogic this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^CommandBlockBaseLogic this]
    (-> this (.getDisplayName))))

(defn get-last-output
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^CommandBlockBaseLogic this]
    (-> this (.getLastOutput))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandBlockBaseLogic this]
    (-> this (.getName))))

(defn send-message
  "component - `net.minecraft.util.text.ITextComponent`"
  ([^CommandBlockBaseLogic this ^net.minecraft.util.text.ITextComponent component]
    (-> this (.sendMessage component))))

(defn send-command-feedback
  "returns: `boolean`"
  (^Boolean [^CommandBlockBaseLogic this]
    (-> this (.sendCommandFeedback))))

(defn should-track-output?
  "returns: `boolean`"
  (^Boolean [^CommandBlockBaseLogic this]
    (-> this (.shouldTrackOutput))))

(defn set-last-output
  "last-output-message - `net.minecraft.util.text.ITextComponent`"
  ([^CommandBlockBaseLogic this ^net.minecraft.util.text.ITextComponent last-output-message]
    (-> this (.setLastOutput last-output-message))))

(defn set-track-output
  "should-track-output - `boolean`"
  ([^CommandBlockBaseLogic this ^Boolean should-track-output]
    (-> this (.setTrackOutput should-track-output))))

(defn can-use-command?
  "perm-level - `int`
  command-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^CommandBlockBaseLogic this ^Integer perm-level ^java.lang.String command-name]
    (-> this (.canUseCommand perm-level command-name))))

(defn get-command-block-type
  "returns: `int`"
  (^Integer [^CommandBlockBaseLogic this]
    (-> this (.getCommandBlockType))))

(defn trigger
  "world-in - `net.minecraft.world.World`"
  ([^CommandBlockBaseLogic this ^net.minecraft.world.World world-in]
    (-> this (.trigger world-in))))

(defn set-success-count
  "success-count-in - `int`"
  ([^CommandBlockBaseLogic this ^Integer success-count-in]
    (-> this (.setSuccessCount success-count-in))))

(defn fill-in-info
  "buf - `io.netty.buffer.ByteBuf`"
  ([^CommandBlockBaseLogic this ^io.netty.buffer.ByteBuf buf]
    (-> this (.fillInInfo buf))))

