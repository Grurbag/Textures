// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelSkavenBody extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightArm;
	private final ModelRenderer tail;

	public WFMModelSkavenBody() {
		texWidth = 64;
		texHeight = 64;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 7.0F, -2.0F);
		setRotationAngle(Body, 0.3927F, 0.0F, 0.0F);
		Body.texOffs(16, 13).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		Body.texOffs(16, 29).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(4.0F, 4.0F, -4.0F);
		leftArm.texOffs(40, 15).addBox(0.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.49F, false);
		leftArm.texOffs(40, 38).addBox(0.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.69F, false);
		leftArm.texOffs(40, 25).addBox(0.0F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, -0.1F, false);
		leftArm.texOffs(42, 48).addBox(0.0F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.29F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-4.0F, 4.0F, -4.0F);
		rightArm.texOffs(40, 15).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.49F, true);
		rightArm.texOffs(40, 25).addBox(-4.0F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, -0.1F, true);
		rightArm.texOffs(40, 38).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.69F, true);
		rightArm.texOffs(42, 48).addBox(-4.0F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.29F, true);

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, 12.0F, 1.0F);
		setRotationAngle(tail, -0.3927F, 0.0F, 0.0F);
		tail.texOffs(0, 60).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		tail.texOffs(8, 42).addBox(0.0F, -3.0F, 2.0F, 0.0F, 7.0F, 15.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}