package Eac.block.Other.CustomRender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Modelactivationcatal extends ModelBase {
    //fields
    ModelRenderer front;
    ModelRenderer right;
    ModelRenderer left;
    ModelRenderer back;
    ModelRenderer bottom;
    ModelRenderer Top;
    ModelRenderer Outline1;
    ModelRenderer Outline2;
    ModelRenderer Outline3;
    ModelRenderer Outline4;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;

    public Modelactivationcatal() {
        textureWidth = 128;
        textureHeight = 64;

        front = new ModelRenderer(this, 0, 0);
        front.addBox(0F, 0F, 0F, 16, 15, 1);
        front.setRotationPoint(-8F, 9F, 7F);
        front.setTextureSize(128, 64);
        front.mirror = true;
        setRotation(front, 0F, 0F, 0F);
        right = new ModelRenderer(this, 0, 16);
        right.addBox(0F, 0F, 0F, 1, 15, 14);
        right.setRotationPoint(-8F, 9F, -7F);
        right.setTextureSize(128, 64);
        right.mirror = true;
        setRotation(right, 0F, 0F, 0F);
        left = new ModelRenderer(this, 30, 16);
        left.addBox(0F, 0F, 0F, 1, 15, 14);
        left.setRotationPoint(7F, 9F, -7F);
        left.setTextureSize(128, 64);
        left.mirror = true;
        setRotation(left, 0F, 0F, 0F);
        back = new ModelRenderer(this, 34, 0);
        back.addBox(0F, 0F, 0F, 16, 15, 1);
        back.setRotationPoint(-8F, 9F, -8F);
        back.setTextureSize(128, 64);
        back.mirror = true;
        setRotation(back, 0F, 0F, 0F);
        bottom = new ModelRenderer(this, 0, 45);
        bottom.addBox(0F, 0F, 0F, 18, 1, 18);
        bottom.setRotationPoint(-9F, 23F, -9F);
        bottom.setTextureSize(128, 64);
        bottom.mirror = true;
        setRotation(bottom, 0F, 0F, 0F);
        Top = new ModelRenderer(this, 68, 0);
        Top.addBox(0F, 0F, 0F, 14, 1, 14);
        Top.setRotationPoint(-7F, 9F, -7F);
        Top.setTextureSize(128, 64);
        Top.mirror = true;
        setRotation(Top, 0F, 0F, 0F);
        Outline1 = new ModelRenderer(this, 98, 62);
        Outline1.addBox(0F, 0F, 0F, 14, 1, 1);
        Outline1.setRotationPoint(-7F, 8F, -7F);
        Outline1.setTextureSize(128, 64);
        Outline1.mirror = true;
        setRotation(Outline1, 0F, 0F, 0F);
        Outline2 = new ModelRenderer(this, 98, 62);
        Outline2.addBox(0F, 0F, 0F, 14, 1, 1);
        Outline2.setRotationPoint(-7F, 8F, 6F);
        Outline2.setTextureSize(128, 64);
        Outline2.mirror = true;
        setRotation(Outline2, 0F, 0F, 0F);
        Outline3 = new ModelRenderer(this, 98, 62);
        Outline3.addBox(0F, 0F, 0F, 14, 1, 1);
        Outline3.setRotationPoint(-7F, 8F, 7F);
        Outline3.setTextureSize(128, 64);
        Outline3.mirror = true;
        setRotation(Outline3, 0F, 1.570796F, 0F);
        Outline4 = new ModelRenderer(this, 98, 62);
        Outline4.addBox(0F, 0F, 0F, 14, 1, 1);
        Outline4.setRotationPoint(6F, 8F, 7F);
        Outline4.setTextureSize(128, 64);
        Outline4.mirror = true;
        setRotation(Outline4, 0F, 1.570796F, 0F);
        Shape1 = new ModelRenderer(this, 103, 20);
        Shape1.addBox(0F, 0F, 0F, 12, 1, 1);
        Shape1.setRotationPoint(0F, 8F, 6F);
        Shape1.setTextureSize(128, 64);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 1.570796F, 0F);
        Shape2 = new ModelRenderer(this, 113, 22);
        Shape2.addBox(0F, 0F, 0F, 2, 1, 6);
        Shape2.setRotationPoint(0F, 8F, 1F);
        Shape2.setTextureSize(128, 64);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 1.570796F, 0F);
        Shape3 = new ModelRenderer(this, 103, 60);
        Shape3.addBox(0F, 0F, 0F, 12, 1, 1);
        Shape3.setRotationPoint(-6F, 8F, 6F);
        Shape3.setTextureSize(128, 64);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 1.570796F, 0F);
        Shape4 = new ModelRenderer(this, 111, 29);
        Shape4.addBox(0F, 0F, 0F, 4, 1, 5);
        Shape4.setRotationPoint(-5F, 8F, -2.033333F);
        Shape4.setTextureSize(128, 64);
        Shape4.mirror = true;
        setRotation(Shape4, 0F, 1.570796F, 0F);
        Shape5 = new ModelRenderer(this, 111, 35);
        Shape5.addBox(0F, 0F, 0F, 4, 1, 5);
        Shape5.setRotationPoint(-5F, 8F, 6F);
        Shape5.setTextureSize(128, 64);
        Shape5.mirror = true;
        setRotation(Shape5, 0F, 1.570796F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        front.render(f5);
        right.render(f5);
        left.render(f5);
        back.render(f5);
        bottom.render(f5);
        Top.render(f5);
        Outline1.render(f5);
        Outline2.render(f5);
        Outline3.render(f5);
        Outline4.render(f5);
        Shape1.render(f5);
        Shape2.render(f5);
        Shape3.render(f5);
        Shape4.render(f5);
        Shape5.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
