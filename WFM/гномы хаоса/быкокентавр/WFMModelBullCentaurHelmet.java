// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelBullCentaurHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;

	public WFMModelBullCentaurHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 24.0F, 0.0F);
		setRotationAngle(head, 0.0F, 3.1416F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.4F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.5F, false);
		head.texOffs(35, 31).addBox(-3.5F, -16.0F, -3.5F, 7.0F, 7.0F, 7.0F, 0.6F, false);
		head.texOffs(34, 17).addBox(-3.5F, -16.0F, -3.5F, 7.0F, 6.0F, 7.0F, 1.0F, false);
		head.texOffs(20, 51).addBox(-5.5F, -19.0F, -5.5F, 11.0F, 2.0F, 11.0F, 0.0F, false);
		head.texOffs(0, 46).addBox(-3.5F, -20.0F, -3.5F, 7.0F, 1.0F, 7.0F, 0.0F, false);
		head.texOffs(0, 0).addBox(-1.0F, -22.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.texOffs(0, 45).addBox(-1.5F, -26.0F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, false);
		head.texOffs(0, 32).addBox(4.0F, -13.0F, 0.0F, 5.0F, 4.0F, 0.0F, 0.0F, false);
		head.texOffs(0, 36).addBox(4.0F, -17.0F, 0.0F, 5.0F, 4.0F, 0.0F, 0.0F, false);
		head.texOffs(10, 36).addBox(-9.0F, -17.0F, 0.0F, 5.0F, 4.0F, 0.0F, 0.0F, false);
		head.texOffs(10, 32).addBox(-9.0F, -13.0F, 0.0F, 5.0F, 4.0F, 0.0F, 0.0F, false);
		head.texOffs(0, 19).addBox(-3.5F, -17.0F, 4.5F, 8.0F, 8.0F, 0.0F, -0.5F, false);
		head.texOffs(0, 19).addBox(-3.5F, -17.0F, -5.5F, 8.0F, 8.0F, 0.0F, -0.5F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}