<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        Schema::create('data_types', function (Blueprint $table) {
            $table->char('id', 32)->comment('ID');

            $table->boolean('Booleans')->nullable(true)->default(false)->comment('Booleans');
            $table->string('Strings', 64)->nullable(true)->default('')->comment('Strings');
            $table->text('Texts')->nullable(true)->default(null)->comment('Texts');
            $table->integer('Integers')->nullable(true)->default(null)->comment('Integers');
            $table->decimal('Floats', 12, 4)->nullable(false)->default(null)->comment('Floats');
            $table->dateTime('Dates', 3)->nullable(true)->default(null)->comment('Dates');
            $table->integer('Enums')->nullable(false)->default(0)->comment('Enums');
            $table->char('Models', 32)->nullable(true)->default(null)->comment('Models');
            $table->json('Jsons')->nullable(true)->default(null)->comment('Jsons');
            $table->char('Files', 32)->nullable(true)->default(null)->comment('Files');

            $table->string('note', 64)->comment('备注');
            $table->boolean('is_system', 64)->nullable(false)->default(true)->comment('系统预置');

            $table->string('remark', 255)->nullable(true)->default('')->comment('备注');
            $table->boolean('is_valid')->nullable(false)->default(true)->comment('是否有效');
            $table->char('created_by', 32)->nullable(false)->comment('创建人ID');
            $table->dateTime('created_at', $precision = 0)->useCurrent()->comment('创建时间');
            $table->char('updated_by', 32)->nullable(true)->default(null)->comment('更新人ID');
            $table->dateTime('updated_at', $precision = 0)->nullable(true)->default(null)->useCurrentOnUpdate()->comment('更新时间');
            $table->unsignedInteger('updated_count')->nullable(true)->default(0)->comment('更新总次数');
            $table->char('deleted_by', 32)->nullable(true)->default(null)->comment('删除人ID');
            $table->dateTime('deleted_at', $precision = 0)->nullable(true)->default(null)->comment('删除时间');

            $table->primary('id');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('data_types');
    }
};
