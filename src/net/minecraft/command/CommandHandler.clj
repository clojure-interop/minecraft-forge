(ns net.minecraft.command.CommandHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command CommandHandler]))

(defn ->command-handler
  "Constructor."
  (^CommandHandler []
    (new CommandHandler )))

(defn execute-command
  "sender - `net.minecraft.command.ICommandSender`
  raw-command - `java.lang.String`

  returns: `int`"
  (^Integer [^CommandHandler this ^net.minecraft.command.ICommandSender sender ^java.lang.String raw-command]
    (-> this (.executeCommand sender raw-command))))

(defn register-command
  "command - `net.minecraft.command.ICommand`

  returns: `net.minecraft.command.ICommand`"
  (^net.minecraft.command.ICommand [^CommandHandler this ^net.minecraft.command.ICommand command]
    (-> this (.registerCommand command))))

(defn get-tab-completions
  "sender - `net.minecraft.command.ICommandSender`
  input - `java.lang.String`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CommandHandler this ^net.minecraft.command.ICommandSender sender ^java.lang.String input ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getTabCompletions sender input pos))))

(defn get-possible-commands
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.util.List<net.minecraft.command.ICommand>`"
  (^java.util.List [^CommandHandler this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getPossibleCommands sender))))

(defn get-commands
  "returns: `java.util.Map<java.lang.String,net.minecraft.command.ICommand>`"
  (^java.util.Map [^CommandHandler this]
    (-> this (.getCommands))))

