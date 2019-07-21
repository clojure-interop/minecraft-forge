(ns net.minecraft.command.CommandClearInventory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command CommandClearInventory]))

(defn ->command-clear-inventory
  "Constructor."
  (^CommandClearInventory []
    (new CommandClearInventory )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandClearInventory this]
    (-> this (.getName))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandClearInventory this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn get-required-permission-level
  "returns: `int`"
  (^Integer [^CommandClearInventory this]
    (-> this (.getRequiredPermissionLevel))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandClearInventory this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

(defn get-tab-completions
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`
  target-pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CommandClearInventory this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args ^net.minecraft.util.math.BlockPos target-pos]
    (-> this (.getTabCompletions server sender args target-pos))))

(defn username-index?
  "args - `java.lang.String[]`
  index - `int`

  returns: `boolean`"
  (^Boolean [^CommandClearInventory this args ^Integer index]
    (-> this (.isUsernameIndex args index))))

