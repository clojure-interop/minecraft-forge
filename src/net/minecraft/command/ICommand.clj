(ns net.minecraft.command.ICommand
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command ICommand]))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ICommand this]
    (-> this (.getName))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^ICommand this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn get-aliases
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ICommand this]
    (-> this (.getAliases))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^ICommand this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

(defn check-permission
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`

  returns: `boolean`"
  (^Boolean [^ICommand this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender]
    (-> this (.checkPermission server sender))))

(defn get-tab-completions
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`
  target-pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ICommand this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args ^net.minecraft.util.math.BlockPos target-pos]
    (-> this (.getTabCompletions server sender args target-pos))))

(defn username-index?
  "args - `java.lang.String[]`
  index - `int`

  returns: `boolean`"
  (^Boolean [^ICommand this args ^Integer index]
    (-> this (.isUsernameIndex args index))))

