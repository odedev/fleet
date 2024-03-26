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
        Schema::create('roles', function (Blueprint $table) {
            $table->char('id', 32)->comment('ID');

            $table->string('code', 64)->comment('编码');
            $table->string('name', 64)->comment('名称');

            $table->string('note', 64)->comment('备注');
            $table->boolean('isSystem', 64)->nullable(false)->default(true)->comment('系统预置');

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
            $table->unique('code');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('roles');
    }
};
