<?php

namespace App\Observers;

use App\Models\UserRole;

class UserRoleObserver
{
    /**
     * Handle the UserRole "created" event.
     */
    public function created(UserRole $userRole): void
    {
        //
    }

    /**
     * Handle the UserRole "updated" event.
     */
    public function updated(UserRole $userRole): void
    {
        //
    }

    /**
     * Handle the UserRole "deleted" event.
     */
    public function deleted(UserRole $userRole): void
    {
        //
    }

    /**
     * Handle the UserRole "restored" event.
     */
    public function restored(UserRole $userRole): void
    {
        //
    }

    /**
     * Handle the UserRole "force deleted" event.
     */
    public function forceDeleted(UserRole $userRole): void
    {
        //
    }
}
